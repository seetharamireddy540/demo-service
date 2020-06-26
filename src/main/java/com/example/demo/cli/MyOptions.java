package com.example.demo.cli;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyOptions {

    @Option(name = "-r", usage = "recursively run something")
    private boolean recursive;

    @Option(name = "-o", usage = "output to this file")
    private File out;

    @Option(name = "-str")        // no usage
    private String str = "(default value)";

    @Option(name = "-n", usage = "usage can have new lines in it\n and also it can be long")
    private int num;

    // receives other command line parameters than options
    @Argument
    private List<String> arguments = new ArrayList<>();

}
