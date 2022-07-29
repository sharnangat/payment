package com.payment.system.Account.controller;

import java.net.URI;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.payment.system.Account.dto.DepartmentsDTO;
import com.payment.system.Account.exception.DeparmentException;
import com.payment.system.Account.services.DepartmentService;

@RestController
@RequestMapping(value = "/dpt")
public class DepartmentController {

	@Autowired
	private DepartmentService service;

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DepartmentsDTO> addDepartment(@RequestBody DepartmentsDTO dto) throws DeparmentException {

		ResponseEntity<DepartmentsDTO> res = null;

		try {

			service.addDept(dto);
			res.status(HttpStatus.CREATED).body(dto);
		} catch (Exception ex) {

			res.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unable to insert");

		}

		return res;
	}

	// GET

//PUT

//DELETE

}
