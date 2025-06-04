package com.ohgiraffers.elasticbeanstalk.service;

import com.ohgiraffers.elasticbeanstalk.dto.MenuDTO;
import com.ohgiraffers.elasticbeanstalk.entity.Menu;
import com.ohgiraffers.elasticbeanstalk.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository repository;
    private final ModelMapper modelMapper;

    public MenuDTO findByMenuCode(int menuCode) {

        Menu foundMenu = repository.findById(menuCode).orElseThrow(IllegalArgumentException::new);

        return modelMapper.map(foundMenu , MenuDTO.class);
    }
}
