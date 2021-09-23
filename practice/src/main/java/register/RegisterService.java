package register;

import java.util.List;

import org.springframework.stereotype.Service;

@Service("RegisterService")
public interface RegisterService {

	public void insertRegister(RegisterVO vo);
	
	
	public void updateRegister(RegisterVO vo);
	
	
	public void deleteRegister(RegisterVO vo);
	
	
	public RegisterVO getRegister(RegisterVO vo);


	List<RegisterVO> getRegisterList();
	
}
