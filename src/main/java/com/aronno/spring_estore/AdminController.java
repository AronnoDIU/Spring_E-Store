package com.aronno.spring_estore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String adminDashboard() {
        return "admin_dashboard.html";
    }

    @GetMapping("/admin/products")
    public String manageProducts() {
        return "admin_products.html";
    }

    @GetMapping("/admin/orders")
    public String manageOrders() {
        return "admin_orders.html";
    }

    @GetMapping("/admin/users")
    public String manageUsers() {
        return "admin_users.html";
    }

    @PostMapping("/admin/addProduct")
    public String addProduct(@RequestParam String productName, @RequestParam double price, @RequestParam String description) {
        // Implement product addition logic here
        return "redirect:/admin/products";
    }

    @PostMapping("/admin/deleteProduct")
    public String deleteProduct(@RequestParam int productId) {
        // Implement product deletion logic here
        return "redirect:/admin/products";
    }

    @PostMapping("/admin/updateOrderStatus")
    public String updateOrderStatus(@RequestParam int orderId, @RequestParam String status) {
        // Implement order status update logic here
        return "redirect:/admin/orders";
    }

    @PostMapping("/admin/deleteUser")
    public String deleteUser(@RequestParam int userId) {
        // Implement user deletion logic here
        return "redirect:/admin/users";
    }
}
