package com.mresitcagan.web.service.impl;

import com.mresitcagan.web.dto.ClubDto;
import com.mresitcagan.web.model.Club;
import com.mresitcagan.web.repository.ClubRepository;
import com.mresitcagan.web.service.ClubService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClubServiceImpl implements ClubService {

    ClubRepository repository;

    public ClubServiceImpl(ClubRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ClubDto> findAllClubs() {
        List<Club> clubList = repository.findAll();
        return clubList.stream().map(club -> mapToClubDto(club)).collect(Collectors.toList());
    }

    private ClubDto mapToClubDto(Club club){
        return ClubDto.builder()
                .id(club.getId())
                .content(club.getContent())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .createdOn(club.getCreatedOn())
                .updateOn(club.getUpdateOn())
                .build();
    }
}
