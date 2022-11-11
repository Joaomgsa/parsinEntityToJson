package org.example.model.entities;

public class BodyResponse {

    private Sources sources;
    private Targets targets;
    private SourcesToTargets sourcesToTargets;
    private String units;
    private String distance_units;
    private String mode;

    public BodyResponse() {
    }

    public BodyResponse(Sources sources, Targets targets, SourcesToTargets sourcesToTargets, String units, String distance_units, String mode) {
        this.sources = sources;
        this.targets = targets;
        this.sourcesToTargets = sourcesToTargets;
        this.units = units;
        this.distance_units = distance_units;
        this.mode = mode;
    }

    public Sources getSources() {
        return sources;
    }

    public void setSources(Sources sources) {
        this.sources = sources;
    }

    public Targets getTargets() {
        return targets;
    }

    public void setTargets(Targets targets) {
        this.targets = targets;
    }

    public SourcesToTargets getSourcesToTargets() {
        return sourcesToTargets;
    }

    public void setSourcesToTargets(SourcesToTargets sourcesToTargets) {
        this.sourcesToTargets = sourcesToTargets;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getDistance_units() {
        return distance_units;
    }

    public void setDistance_units(String distance_units) {
        this.distance_units = distance_units;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "{" +
                "sources:" + sources +
                ", targets:" + targets +
                ", sourcesToTargets:" + sourcesToTargets +
                ", units:'" + units + '\'' +
                ", distance_units:'" + distance_units + '\'' +
                ", mode:'" + mode + '\'' +
                '}';
    }
}
