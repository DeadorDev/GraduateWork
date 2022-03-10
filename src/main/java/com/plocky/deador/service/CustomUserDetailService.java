package com.plocky.deador.service;

import com.plocky.deador.model.CustomUserDetail;
import com.plocky.deador.model.User;
import com.plocky.deador.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUserByEmail(email);
        user.orElseThrow(() -> new UsernameNotFoundException("User not found."));
        return user.map(CustomUserDetail::new).get();
    }

//    DON'T WORK
//    public String getCurrentUsername() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (!(authentication instanceof AnonymousAuthenticationToken)) {
//            String currentUserName = authentication.getName();
//            return currentUserName;
//        } else {
//            return null;
//        }
//    }
//    public String getCurrentUsername() {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        return auth.getName();
//    }
//    и передать его в hibernate
//
//    public User getUserByUsername(String username) {
//        CriteriaQuery<User> criteriaQuery = em.getCriteriaBuilder().createQuery(User.class);
//        Root<User> userRequest = criteriaQuery.from(User.class);
//
//        Expression<String> exp = userRequest.get("username");
//        Predicate predicate = exp.in(username);
//
//        criteriaQuery.where(predicate);
//        try {
//            return em.createQuery(criteriaQuery).getSingleResult();
//        } catch (NoResultException e) {
//            return new User();
//        }
//    }

}
