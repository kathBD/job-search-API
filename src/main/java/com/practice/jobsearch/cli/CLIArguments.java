package com.practice.jobsearch.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {
    CLIArguments(){

    }
    @Parameter(
            required = true,
            descriptionKey = "KEYWORD",
            validateWith = CLIKeywordValidator.class,
            description = "KEYWORD"
    )

    private  String keyword;
    @Parameter(
            names = {"category", "c"},
            description = "Busqueda por nombre, id, categoria"
    )
    private  String style;

    @Parameter(
            names = {"--page", "-p"},
            description = "La API regresa 20 resultados"
    )
    private  int page = 0;

    @Parameter(
            names = {"--full"},
            description = "Cantidad de Stock"
    )
    private boolean isStock = false;

    @Parameter(
            names = {"--markdown"},
            description = "Conocer resultado de markdown"
    )
    private boolean isMarkdown = false;

    @Parameter(
            names = {"--help"},
            help = true,
            validateWith = CLIHelpValidor.class,
            description = "mostrar ayuda"

    )
    private  boolean isHelp;

    public String getKeyword() {
        return keyword;
    }

    public String getStyle() {
        return style;
    }

    public int getPage() {
        return page;
    }

    public boolean isStock() {
        return isStock;
    }

    public boolean isMarkdown() {
        return isMarkdown;
    }

    public boolean isHelp() {
        return isHelp;
    }

    @Override
    public String toString() {
        return "CLIAArguments{" +
                "keyword='" + keyword + '\'' +
                ", style='" + style + '\'' +
                ", page=" + page +
                ", isStock=" + isStock +
                ", isMarkdown=" + isMarkdown +
                ", isHelp=" + isHelp +
                '}';
    }
    public static CLIArguments newInstance(){
        return new CLIArguments();
    }
}
