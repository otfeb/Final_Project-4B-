package boot.data.service;

import java.util.List;

import boot.data.Dto.AdminLoginDto;
import boot.data.Dto.LoginDto;
import boot.data.Dto.NoticeDto;

public interface AdminServiceInter {
	public AdminLoginDto getAdminID(String a_id);
	public int adminLoginPassCheck(String id,String pass);
	public void insertNotice(NoticeDto n_dto);
	public List<NoticeDto> getAllNotice();
	public void failreset(String u_id); //페일카운트0으로 초기화
	public List<LoginDto> failuser(); //페일카운트 10이상 유저리스트
}
