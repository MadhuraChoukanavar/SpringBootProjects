package com.mnc.location.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mnc.location.entity.LocationEntity;
import com.mnc.location.service.LocationServiceImpl;

import jakarta.servlet.http.HttpSession;

@Controller
public class LocationController {
	@Autowired
	 LocationServiceImpl serviceLoc;
	
	@RequestMapping("/showCreate")
	public String showCreate()
	{
		return "createLocation";
	}
	@RequestMapping("/saveLocation")
	public String saveLocation(@ModelAttribute("locationEntity") LocationEntity location, ModelMap modelMap)
	{
		
		LocationEntity locationDetails = serviceLoc.saveLocationDetails(location);
		String msg="location saved with id :"+locationDetails.getId();
		modelMap.addAttribute("msg", msg);
		return "createLocation";
	}
	@RequestMapping("/displaylocation")
	public String displayAllLocation(ModelMap map )
	{
		System.out.print("Log: Reached Here");
		List<LocationEntity> location = serviceLoc.getAllLocation();
		System.out.print("Log: Reached Here2");
		map.addAttribute("location",location);
		System.out.print("Log: Reached Here 3");
		return "/displaylocation";
		
	}
	@RequestMapping("/deletelocation")
	public String deleteLocations(@RequestParam("id") int id,ModelMap map)
	{
		LocationEntity location = new LocationEntity();
		location.setId(id);
		serviceLoc.deleteLocation(location);
		
		List<LocationEntity> locations = serviceLoc.getAllLocation();
		map.addAttribute("locations",locations);
		return "displaylocation";
	}
	

}
