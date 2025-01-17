package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.EventData;
import org.launchcode.codingevents.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
    //private static List<Event> events = new ArrayList<>();
    @GetMapping
    public String getEvents(Model model){
        /*List<String> events=new ArrayList<>();
        events.add("Code with Pride");
        events.add("Strange Loop");
        events.add("Apple WWDC");
        events.add("SpringOne Platform");*/
        model.addAttribute("events", EventData.getAll());
        return "events/index";
    }
    @GetMapping("create")
    public String renderCreateEventForm(){
        return "events/create";
    }
    @PostMapping("events/create")
    //public String createEvent(@RequestParam String eventName,@RequestParam String eventDescription){
     public String createEvent(@ModelAttribute Event newEvent){
            //EventData.add(new Event(eventName, eventDescription));
     EventData.add(newEvent);
        return "redirect:/events";

    }
    @GetMapping("delete")
    public String displayDeleteEventForm(Model model){
        model.addAttribute("title", "Delete Events");
        model.addAttribute("events", EventData.getAll());
        return "events/delete";
    }
    @PostMapping("delete")
    public String renderDeleteEventsForm(@RequestParam(required=false) int[] eventIds){
        if(eventIds != null) {
            for (int id : eventIds) {
                EventData.remove(id);
            }
        }
        return "redirect:/events";
    }
}
