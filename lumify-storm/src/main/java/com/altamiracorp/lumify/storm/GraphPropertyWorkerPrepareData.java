package com.altamiracorp.lumify.storm;

import com.altamiracorp.lumify.core.user.User;
import com.altamiracorp.securegraph.Authorizations;
import com.google.inject.Injector;

import java.util.Map;

public class GraphPropertyWorkerPrepareData {
    private final Map stormConf;
    private final User user;
    private final Authorizations authorizations;
    private final Injector injector;

    public GraphPropertyWorkerPrepareData(Map stormConf, User user, Authorizations authorizations, Injector injector) {
        this.stormConf = stormConf;
        this.user = user;
        this.authorizations = authorizations;
        this.injector = injector;
    }

    public Map getStormConf() {
        return stormConf;
    }

    public User getUser() {
        return user;
    }

    public Authorizations getAuthorizations() {
        return authorizations;
    }

    public Injector getInjector() {
        return injector;
    }
}
