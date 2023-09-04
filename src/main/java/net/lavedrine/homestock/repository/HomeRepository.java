package net.lavedrine.homestock.repository;

import net.lavedrine.homestock.domain.Home;
import net.lavedrine.jooq.generated.tables.records.HomeRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

import static net.lavedrine.jooq.generated.Tables.HOME;

@Repository
public class HomeRepository {
    private final DSLContext jooq;

    public HomeRepository(DSLContext jooq) {
        this.jooq = jooq;
    }

    public void create(String name, Instant dateCreated) {
        jooq.insertInto(HOME)
                .set(HOME.NAME, name)
                .set(HOME.DATE_CREATED, dateCreated)
                .set(HOME.LAST_UPDATED, dateCreated)
                .execute();
    }

    public List<Home> getHomes() {
        return jooq.selectFrom(HOME).fetch(this::mapFromRecord);
    }

    private Home mapFromRecord(HomeRecord homeRecord) {
        return Home.fromDb(
                homeRecord.getId(),
                homeRecord.getName(),
                homeRecord.getDateCreated(),
                homeRecord.getLastUpdated()
        );
    }
}
