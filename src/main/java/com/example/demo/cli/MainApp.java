package com.example.demo.cli;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

public class MainApp {
    public static void main(String[] args) throws CmdLineException {
        MyOptions bean = new MyOptions();
        CmdLineParser parser = new CmdLineParser(bean);
        parser.parseArgument(args);
    }
}
