package com.practice.jobsearch;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;
import com.practice.jobsearch.cli.CLIArguments;


import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import static com.practice.jobsearch.ComanderFunctions.buildCommanderWithName;

public class JobSearch {
    JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newInstance);





}