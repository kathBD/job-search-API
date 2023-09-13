package com.practice.jobsearch.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class CLIHelpValidor implements IParameterValidator {

    @Override
    public void validate(String name, String value) throws ParameterException {
        boolean actualValur = Boolean.parseBoolean(value);
        if(actualValur){
            throw new ParameterException("Ayuda solictada");
        }
    }
}
