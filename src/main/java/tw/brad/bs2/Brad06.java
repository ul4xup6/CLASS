package tw.brad.bs2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/brad06")
@RestController
public class Brad06 {
	
	//brad06/m1
		@RequestMapping("/m1")    
		public Member  brad06() {
			Member member = new Member();
			member.setAccount("spring");
			member.setName("spring");
			member.setPasswd("spring");
			
			MemberDao dao = new MemberDao();
			dao.addMember(member);
			
			return member;
		}
}
