package com.carmanconsulting.akka.voting.msg;

public class VoterRegistration {
//----------------------------------------------------------------------------------------------------------------------
// Fields
//----------------------------------------------------------------------------------------------------------------------

    private final String voterId;
    private final String name;

//----------------------------------------------------------------------------------------------------------------------
// Constructors
//----------------------------------------------------------------------------------------------------------------------

    public VoterRegistration(String voterId, String name) {
        this.voterId = voterId;
        this.name = name;
    }

//----------------------------------------------------------------------------------------------------------------------
// Getter/Setter Methods
//----------------------------------------------------------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public String getVoterId() {
        return voterId;
    }
}
