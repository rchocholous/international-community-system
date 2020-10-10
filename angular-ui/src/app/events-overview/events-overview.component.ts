import { Component, OnInit } from '@angular/core';
import {EventsService} from "../events.service";
import { EventListItem } from '../event';

@Component({
  selector: 'app-events-overview',
  templateUrl: './events-overview.component.html',
  styleUrls: ['./events-overview.component.scss']
})
export class EventsOverviewComponent implements OnInit {
  events: EventListItem[];

  constructor(private eventsService: EventsService) { }

  ngOnInit(): void {
    this.getEvents();
  }

  getEvents() {
    this.eventsService.getEventsList().subscribe(events => this.events = events);
  }

}
