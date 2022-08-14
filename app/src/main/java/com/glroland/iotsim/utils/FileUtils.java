package com.glroland.iotsim.utils;

import java.io.File;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import io.quarkus.runtime.annotations.RegisterForReflection;

@ApplicationScoped
@Named("fileUtils")
@RegisterForReflection
public class FileUtils 
{
    
    public boolean exists(String filename)
    {
        File file = new File(filename);
        return file.exists();
    }
}
