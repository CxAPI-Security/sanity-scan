package com.sanity.scan.model;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public enum GovernmentForm {

    MONARCHY(1, "Monarchy"),
    ARISTOCRACY(2, "ARISTOCRACY"),
    TIMOCRACY(3, "TIMOCRACY"),
    OLIGARCHY(4, "OLIGARCHY"),
    DEMOCRACY(5, "DEMOCRACY"),
    THEOCRACY(6, "THEOCRACY"),
    TYRANNY(7, "TYRANNY"),

    OTHER(8, "OTHER");


    private static final Map<Integer, GovernmentForm> GOVERNMENT_FORM_MAP =
            new HashMap<>(GovernmentForm.values().length);
    static {
        for (GovernmentForm g : GovernmentForm.values()) {
            GOVERNMENT_FORM_MAP.put(g.getId(), g);
        }
    }

    public static List<String> getGovernmentForms() {
        return Stream.of(GovernmentForm.values())
                .map(GovernmentForm::name)
                .collect(Collectors.toList());
    }

    private int id;
    private String displayName;

    GovernmentForm(int id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    /**
     * @param id of the form
     * @return GovernmentForm
     */
    public static GovernmentForm getById(int id) {
        GovernmentForm g = GOVERNMENT_FORM_MAP.get(id);
        if (g == null) {
            throw new IllegalArgumentException("No government form with id: " + id);
        } else {
            return g;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }


}
