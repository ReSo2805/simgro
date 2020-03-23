package de.rs.simgro.tenantservice.controller;

import de.rs.simgro.tenantservice.core.util.SimgroError;
import de.rs.simgro.tenantservice.dto.Tenant;
import de.rs.simgro.tenantservice.service.TenantService;
import io.vavr.control.Either;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tenants")
public class TenantController {

    private final TenantService tenantService;

    @Autowired
    public TenantController(TenantService tenantService) {
        this.tenantService = tenantService;
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Either<SimgroError, Tenant> createTenant(@RequestBody Tenant tenant) {
        return tenantService.createTenant(tenant);
    }

    @GetMapping(
            value = "/{tenantId}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Either<SimgroError, Tenant> findTenantBy(@PathVariable String tenantId) {
        return tenantService.findTenantById(tenantId);
    }




}
