package com.example.myapplication.Listeners;

import com.example.myapplication.models.RecipeDetailsResponse;

public interface RecipeDetailsListener {

    void didFetch(RecipeDetailsResponse response, String message);
    void didError(String message);
}
