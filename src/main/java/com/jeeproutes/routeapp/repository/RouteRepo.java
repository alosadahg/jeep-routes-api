package com.jeeproutes.routeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeeproutes.routeapp.model.Route;

public interface RouteRepo extends JpaRepository<Route,String>{
    
}
