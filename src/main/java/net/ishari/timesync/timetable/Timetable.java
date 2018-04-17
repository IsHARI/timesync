package net.ishari.timesync.timetable;

import net.ishari.timesync.activity.Activity;
import net.ishari.timesync.timeslot.TimeSlot;
import net.ishari.timesync.user.User;

import javax.persistence.*;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Timetable {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Activity activity;
    private Period period;

    public Timetable() {
    }

    public Timetable(User user, Period period) {
        this.user = user;
        this.period = period;
    }

    public Period getPeriod() {
        return period;
    }
    public void setPeriod(Period period) {
        this.period = period;
    }
    public Activity getActivity() {
        return activity;
    }
    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
