package com.example.assignment3.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class AIService {
    private final Map<String, String> ASarticles = Map.of(
            "reset password", "How to reset password in your local.",
            "vpn issue", "Troubleshooting VPN connectivity problems.",
            "email not working", "Steps to fix email access issues."
    );

    public List<String> findRelevantArticles(String query) {
        List<String> matches = new ArrayList<>();
        ASarticles.forEach((k, v) -> {
            if (query.toLowerCase().contains(k)) {
                matches.add(v);
            }
        });
        return matches;
    }

    public String generateSummary(List<String> matchedArticles) {
        if (matchedArticles.isEmpty()) {
            return "No relevant articles found.";
        }
        return "Found " + matchedArticles.size() + " relevant article(s): " + String.join(" | ", matchedArticles);
    }
}