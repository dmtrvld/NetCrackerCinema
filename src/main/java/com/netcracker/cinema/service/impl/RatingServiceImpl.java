package com.netcracker.cinema.service.impl;

import com.netcracker.cinema.dao.RatingDao;
import com.netcracker.cinema.model.Rating;
import com.netcracker.cinema.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class RatingServiceImpl implements RatingService {
    private RatingDao ratingDao;

    @Autowired
    RatingServiceImpl(RatingDao ratingDao) {
        this.ratingDao = ratingDao;
    }

    @Override
    public List<Rating> findAll() {
        return ratingDao.findAll();
    }

	    @Override
    public List<Rating> allRating(Date startDate, Date endDate) {
        return ratingDao.allRatings(
                new java.sql.Date(startDate.getTime()),
                new java.sql.Date(endDate.getTime()));
    }

}

