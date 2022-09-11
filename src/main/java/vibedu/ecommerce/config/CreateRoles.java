package vibedu.ecommerce.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import vibedo.ecommerce.enums.RolName;
import vibedu.ecommerce.model.Rol;
import vibedu.ecommerce.services.RolService;

@Service
public class CreateRoles implements CommandLineRunner {
	@Autowired
	RolService rolService;
	@Override
	public void run(String... args) throws Exception {
		Rol rolDeveloper = new Rol(RolName.ROL_DEVELOPER); 
		Rol rolAdmin = new Rol(RolName.ROL_ADMIN); 
		Rol rolSeller = new Rol(RolName.ROL_SELLER); 
		Rol rolTracing= new Rol(RolName.ROL_TRACING); 
		Rol rolAnalytics= new Rol(RolName.ROL_ANALYTICS); 
		Rol rolClient= new Rol(RolName.ROL_CLIENT); 
		rolService.save(rolDeveloper);
		rolService.save(rolAdmin);
		rolService.save(rolSeller);
		rolService.save(rolTracing);
		rolService.save(rolAnalytics);
		rolService.save(rolClient);
		}

}
