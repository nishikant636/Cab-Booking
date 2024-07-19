package com.app.cabbooking.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.cabbooking.Exception.ResourceNotFoundException;
import com.app.cabbooking.cabrepos.CabRepo;
import com.app.cabbooking.models.Cab;




@RestController
@RequestMapping("/bookcab.com")
public class CabController {

	@Autowired
	private CabRepo CR;
	
	/*API FOR FETCHING ALL CAB BOOKING INFORMATION*/
	@GetMapping(value="/cabinfo")
	public List<Cab>AllBookingDetails(){
		return CR.findAll();
		
	}
	/*API FOR BOOKING CAB*/
	@PostMapping(value="/bookingportal")
	public Cab NewBooking(@RequestBody Cab C) {
		return CR.save(C);
	}
	/*API FOR UPDATING BOOKING DETAILS*/
	@PutMapping(value="/updatebooking/{id}")
	public Cab UpdateCabDetails(@PathVariable(value="id") Long CabId, @RequestBody Cab C) {
	Cab setCab = CR.findById(CabId).orElseThrow(()->new ResourceNotFoundException(CabId,"id","Cab"));
	setCab.setPickup_point(C.getPickup_point());
	setCab.setDropping_point(C.getDropping_point());
	setCab.setCurrent_place(C.getCurrent_place());
	Cab updateCab = CR.save(setCab);
	return updateCab;
	}

/*API FOR UPDATING BOOKING DETAILS*/

	@DeleteMapping(value="/deletebooking/{id}")
	public ResponseEntity<?> DeleteCabDetails(@PathVariable(value="id")Long CabId){
		Cab cb = CR.findById(CabId).orElseThrow(()->new ResourceNotFoundException(CabId,"id","Cab"));
		 CR.delete(cb);
		return ResponseEntity.ok().build();
	}

}