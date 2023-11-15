package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.model.SuperUser;
import com.udacity.jwdnd.course1.cloudstorage.services.CredentialsService;
import com.udacity.jwdnd.course1.cloudstorage.services.FilesService;
import com.udacity.jwdnd.course1.cloudstorage.services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private NotesService notesService;

    @Autowired
    private CredentialsService credentialsService;

    @Autowired
    private FilesService filesService;

    @GetMapping(value = {"/", "/home"})
    public ModelAndView getHomePage(Authentication authentication) throws  Exception {
        SuperUser superUser = (SuperUser) authentication.getPrincipal();
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("notes", notesService.getAllNotes(superUser.getUserid()));
        modelAndView.addObject("credentials", credentialsService.getAllCredentials(superUser.getUserid()));
        modelAndView.addObject("files", filesService.getAllFiles(superUser.getUserid()));
        return modelAndView;
    }
}