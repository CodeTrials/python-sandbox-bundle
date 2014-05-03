package org.codetrials.examples.python;

import org.codetrials.bundle.Task;
import org.codetrials.bundle.engines.PythonEngine;
import org.codetrials.bundle.helpers.SimpleBundleContainer;
import org.codetrials.bundle.helpers.tasks.SandboxTask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PythonSandboxBundle extends SimpleBundleContainer {
    
    public PythonSandboxBundle() {
        super(new PythonEngine());
    }

    @Override
    protected List<Task> createTasks() {
        try {
            Task task0 = new SandboxTask(resourceLoader.loadTaskDescription(0));
            List<Task> list = new ArrayList<>();
            list.add(task0);
            return list;
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public String getBundleName() {
        return "Python";
    }

    @Override
    public String getBundleDescription() {
        return "Python sandbox";
    }
}
