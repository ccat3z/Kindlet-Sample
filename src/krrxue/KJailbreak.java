package krrxue;

import ixtab.jailbreak.Jailbreak;

import java.security.AllPermission;

public class KJailbreak extends Jailbreak {
    public boolean enable() {
        if (!super.enable()) {
            return false;
        }
        return getContext().requestPermission(new AllPermission());
    }

}