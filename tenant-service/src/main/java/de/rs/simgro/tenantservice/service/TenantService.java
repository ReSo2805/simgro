package de.rs.simgro.tenantservice.service;

import de.rs.simgro.tenantservice.core.util.SimgroError;
import de.rs.simgro.tenantservice.dto.Tenant;
import io.vavr.control.Either;
import org.springframework.stereotype.Service;

@Service
public class TenantService {

    public Either<SimgroError, Tenant> createTenant(Tenant tenant) {
        return Either.right(new Tenant("fsfsefse", "fesfsefhsefh"));
    }


    public Either<SimgroError, Tenant> findTenantById(String tenantId) {
        return Either.right(new Tenant("adsd", "adsad"));
    }
}
