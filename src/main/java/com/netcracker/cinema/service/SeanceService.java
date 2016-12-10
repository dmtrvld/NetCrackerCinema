package com.netcracker.cinema.service;


import com.netcracker.cinema.dao.filter.impl.SeanceFilter;
import com.netcracker.cinema.model.Seance;
import com.netcracker.cinema.dao.Paginator;

import java.util.List;

public interface SeanceService {
    List<Seance> findAll();
    Seance getById(long id);
    void delete(Seance seance);
    void save(Seance seance);
    Paginator<Seance> getPaginator(int pageSize);
    Paginator<Seance> getPaginator(int pageSize, SeanceFilter seanceFilter);
}
