package com.mresitcagan.web.service;

import com.mresitcagan.web.dto.ClubDto;
import com.mresitcagan.web.model.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();

    Club saveClub(Club club);
}
