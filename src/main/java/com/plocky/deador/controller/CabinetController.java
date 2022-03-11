package com.plocky.deador.controller;

import com.plocky.deador.global.GlobalData;
import com.plocky.deador.model.Order;
import com.plocky.deador.model.OrderItem;
import com.plocky.deador.model.User;
import com.plocky.deador.service.CategoryService;
import com.plocky.deador.service.CustomUserDetailService;
import com.plocky.deador.service.OrderItemService;
import com.plocky.deador.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CabinetController {
    CustomUserDetailService customUserDetailService;
    OrderService orderService;
    CategoryService categoryService;
    OrderItemService orderItemService;

    @Autowired
    public CabinetController(CustomUserDetailService customUserDetailService, OrderService orderService, CategoryService categoryService, OrderItemService orderItemService) {
        this.customUserDetailService = customUserDetailService;
        this.orderService = orderService;
        this.categoryService = categoryService;
        this.orderItemService = orderItemService;
    }

    @GetMapping("/personalCabinet")
    public String getPersonalCabinet(Model model,
                                     @AuthenticationPrincipal User user) {
        String email = user.getEmail();
        List<Order> listOrders = orderService.getAllOrdersByEmail(email);
        model.addAttribute("user", user);
        model.addAttribute("listOrders", listOrders);
        model.addAttribute("cartCount", GlobalData.cart.size());
        return "/personalCabinet";
    }
}
