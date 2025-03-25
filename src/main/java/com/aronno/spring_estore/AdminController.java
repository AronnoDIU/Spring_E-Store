package com.aronno.spring_estore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @GetMapping("/admin")
    public String adminDashboard() {
        logger.info("Accessing admin dashboard");
        return "admin_dashboard.html";
    }

    @GetMapping("/admin/products")
    public String manageProducts() {
        logger.info("Accessing manage products page");
        return "admin_products.html";
    }

    @GetMapping("/admin/orders")
    public String manageOrders() {
        logger.info("Accessing manage orders page");
        return "admin_orders.html";
    }

    @GetMapping("/admin/users")
    public String manageUsers() {
        logger.info("Accessing manage users page");
        return "admin_users.html";
    }

    @PostMapping("/admin/addProduct")
    public String addProduct(@RequestParam String productName, @RequestParam double price, @RequestParam String description) {
        logger.info("Adding product: {}, price: {}, description: {}", productName, price, description);
        // Implement product addition logic here
        return "redirect:/admin/products";
    }

    @PostMapping("/admin/deleteProduct")
    public String deleteProduct(@RequestParam int productId) {
        logger.info("Deleting product with ID: {}", productId);
        // Implement product deletion logic here
        return "redirect:/admin/products";
    }

    @PostMapping("/admin/updateOrderStatus")
    public String updateOrderStatus(@RequestParam int orderId, @RequestParam String status) {
        logger.info("Updating order status for order ID: {} to {}", orderId, status);
        // Implement order status update logic here
        return "redirect:/admin/orders";
    }

    @PostMapping("/admin/deleteUser")
    public String deleteUser(@RequestParam int userId) {
        logger.info("Deleting user with ID: {}", userId);
        // Implement user deletion logic here
        return "redirect:/admin/users";
    }
}
