package com.oracle.ohTravel.hotel.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.ohTravel.hotel.model.HotelDTO;
import com.oracle.ohTravel.hotel.service.HotelService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/hotel")
@RequiredArgsConstructor
public class HotelController {

	
	private final HotelService hs;
	
	// [숙박] 카테고리 선택 시의 화면
	@GetMapping(value = "/hotelmain")
	public String goHotel() {
		return "hotel/hotelMain";
	}
	
	
	//호텔 전체 List 조회
	@GetMapping(value = "/hotelHome")
	public String goHotelHome(HotelDTO hoteldto, Model model) {
		
		List<HotelDTO> hotelList = hs.hotelList(hoteldto);
		model.addAttribute("hotelList", hotelList);
		
		return "hotel/hotelHome";
	}
	
	//호텔 목록에서 호텔 하나를 선택했을때 나올 페이지 (단건 조회)
	@GetMapping(value = "/hotelDetail")
	public String goHotelDetail(HotelDTO hotelDTO, Model model) {
		System.out.println("hotelDetail Controller Start...");
		hotelDTO = hs.getHotelDetail(hotelDTO);
		model.addAttribute("hotelDetail", hotelDTO);
		System.out.println("hotelDTO->"+hotelDTO);
		return "hotel/hotelDetail";
	}
}
