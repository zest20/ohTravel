package com.oracle.ohTravel.manager.dao;

import java.util.List;

import com.oracle.ohTravel.manager.dto.CouponDTO;
import com.oracle.ohTravel.manager.dto.ManageAirportDTO;
import com.oracle.ohTravel.manager.dto.MemberDTO;
import com.oracle.ohTravel.manager.dto.MembershipDTO;
import com.oracle.ohTravel.manager.dto.NoticeDTO;
import com.oracle.ohTravel.manager.dto.ManagePackageDTO;
import com.oracle.ohTravel.manager.dto.ManageTicketDTO;

public interface ManagerDAO {

	int totalMember();
	
	List<MemberDTO> getMemberList(MemberDTO member);

	List<MembershipDTO> getMembershipList();

	List<MembershipDTO> getUserDetail(String mem_id);

	int updateUserRole(MembershipDTO membership);

	int updateUserMemName(MembershipDTO membership);

	int deleteUser(String mem_id);

	List<MembershipDTO> getMembershipDetail(int membership_id);

	int updateMembership(MembershipDTO membership);

	int deleteMembership(MembershipDTO membership);

	int insertMembership(MembershipDTO membership);

	List<NoticeDTO> getNoticeList(NoticeDTO notice);

	List<NoticeDTO> getNoticeDetail(int notice_id);

	int updateNotice(NoticeDTO notice);

	int deleteNotice(NoticeDTO notice);

	int insertNotice(NoticeDTO notice);

	List<CouponDTO> getCouponList();

	List<CouponDTO> getCouponDetail(CouponDTO coupon);

	List<CouponDTO> getCouponMemberDetail(CouponDTO coupon);

	int updateCoupon(CouponDTO coupon);

	int deleteCoupon(CouponDTO coupon);

	int insertCoupon(CouponDTO coupon);

	List<ManageTicketDTO> getTicketList(ManageTicketDTO ticket);

	List<ManageTicketDTO> getTicketDetail(ManageTicketDTO ticket);

	List<ManageTicketDTO> getCountryList();

	List<ManageTicketDTO> getCityList(ManageTicketDTO ticket);

	List<ManageTicketDTO> getCityListChangeCountry(ManageTicketDTO ticket);

	int updateTicket(ManageTicketDTO ticket);

	int insertTicket(ManageTicketDTO ticket);

	int deleteTicket(ManageTicketDTO ticket);

	int totalTicket();

	int totalNotice();

	int totalPackage();

	List<ManagePackageDTO> getPackageList(ManagePackageDTO pk);

	List<ManagePackageDTO> getPackageDetail(ManagePackageDTO pk);

	int totalPackageDetail(ManagePackageDTO pk);

	List<ManagePackageDTO> getAttractionList(ManagePackageDTO pk);

	int totalAttraction();

	int insertAttraction(ManagePackageDTO pk);

	List<ManagePackageDTO> getAttractionDetail(ManagePackageDTO pk);

	List<ManagePackageDTO> getCityList(ManagePackageDTO pk);

	int updateAttraction(ManagePackageDTO pk);

	int deleteAttraction(ManagePackageDTO pk);

	int insertPackage(ManagePackageDTO pk);

	List<ManagePackageDTO> getPackageDetailOne(ManagePackageDTO pk);

	List<ManageAirportDTO> getAirScheduleList(ManageAirportDTO air);

	int totalAirSchedule();

	int totalAirline();

	List<ManageAirportDTO> getAirlineList(ManageAirportDTO air);

	List<ManageAirportDTO> getAirlineDetail(ManageAirportDTO air);

	int updateAirline(ManageAirportDTO air);

	int insertAirline(ManageAirportDTO air);

	int deleteAirline(ManageAirportDTO air);

	List<ManageAirportDTO> getAirplaneList(ManageAirportDTO air);

	int totalAirplane();

	List<ManageAirportDTO> getAirplaneDetail(ManageAirportDTO air);

	int updateAirplane(ManageAirportDTO air);

	int deleteAirplane(ManageAirportDTO air);

	int insertAirplane(ManageAirportDTO air);

	List<ManageAirportDTO> getStartAirportList(ManageAirportDTO air);

	int totalStartAirport();

	int insertStartAirport(ManageAirportDTO air);

	List<ManageAirportDTO> getStartAirportDetail(ManageAirportDTO air);

	int updateStartAirport(ManageAirportDTO air);

	int deletestartAirport(ManageAirportDTO air);

	int totalEndAirport();

	List<ManageAirportDTO> getEndAirportList(ManageAirportDTO air);

	int insertEndAirport(ManageAirportDTO air);

	List<ManageAirportDTO> getEndAirportDetail(ManageAirportDTO air);

	int updateEndAirport(ManageAirportDTO air);

	int deleteEndAirport(ManageAirportDTO air);

	List<ManageAirportDTO> getSeatList();

	List<ManageAirportDTO> getAirlineList();

	List<ManageAirportDTO> getAirplaneList();

	List<ManageAirportDTO> getStartAirportList();

	List<ManageAirportDTO> getEndAirportList();

	List<ManageAirportDTO> getAirplaneChange(ManageAirportDTO air);

	List<ManageAirportDTO> getAirScheduleDetail(ManageAirportDTO air);

	int insertAirSchedule(ManageAirportDTO air);

	int deleteAirSchedule(ManageAirportDTO air);



}
