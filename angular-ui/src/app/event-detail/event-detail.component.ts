import {Component, OnInit} from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import {EventDetail} from "../event";
import {EventsService} from "../events.service";

@Component({
  selector: 'app-event-detail',
  templateUrl: './event-detail.component.html',
  styleUrls: ['./event-detail.component.scss']
})
export class EventDetailComponent implements OnInit {
  event: EventDetail;

  constructor(private eventsService: EventsService,
    private route: ActivatedRoute,
    private location: Location) { }

  ngOnInit(): void {
    this.getEvent();
  }

  getEvent() {
    const id = + this.route.snapshot.paramMap.get('id');
    this.eventsService.getEventDetail(id).subscribe(event => this.event = event);
  }
}
