package com.practice.jobsearch.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class CLIKeywordValidator implements IParameterValidator {

    @Override
    public void validate(String name, String value) throws ParameterException {
        if(value.matches("[a-zA-Z]+[0-9]*$")){
            System.err.println("El criterio de Busqueda no es valido");
            throw  new ParameterException(("Unicamente números y letras"));

        }
    }
}
