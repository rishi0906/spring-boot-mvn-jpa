package com.dating.test.controller;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dating.test.dao.DatingDaoRepository;
import com.dating.test.model.SampleModelClass;

@Controller
public class TestController {
	
	@Autowired 
	DatingDaoRepository dating;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public Response sadsad() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("dsfdffgfdf").build();
		}
		return Response.status(Status.OK).entity("sdfsdffdf").build();
	}
	
	@RequestMapping(value = "/getMswipe/{prospect}", method = RequestMethod.GET)
	@ResponseBody
	public Response getLoanDetailsById(@PathVariable("prospect") String prospe) {
		SampleModelClass dsf = null;
		try {
			dsf = (SampleModelClass) dating.findByprospectNo(prospe);
		System.err.println(dsf.getProspectNo());
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("test").build();
		}
		return Response.status(Status.OK).entity(dsf).build();
	}
	
	
	@RequestMapping(value = "/sad", method = RequestMethod.GET)
	@ResponseBody
	public Response sdf() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("dsfdffgfdf").build();
		}
		return Response.status(Status.OK).entity("sadsdfff").build();
	}
}
