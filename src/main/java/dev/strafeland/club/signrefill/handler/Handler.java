package dev.strafeland.club.signrefill.handler;

import dev.strafeland.club.signrefill.Main;

public class Handler {

    private Main instance;

    public Handler(final Main instance) {
        this.instance = instance;
    }

        public void enable() {
    }

        public void disable() {
    }

        public Main getInstance() {
        return this.instance;
    }

}
