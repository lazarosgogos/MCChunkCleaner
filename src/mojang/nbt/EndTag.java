package mojang.nbt;

/**
 * Copyright Mojang AB.
 * 
 * Don't do evil.
 */

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class EndTag extends Tag {

    public EndTag() {
        super(null);
    }

    @Override
	void load(DataInput dis) throws IOException {
    }

    @Override
	void write(DataOutput dos) throws IOException {
    }

    @Override
	public byte getId() {
        return TAG_End;
    }

    @Override
	public String toString() {
        return "END";
    }

    @Override
    public Tag copy() {
        return new EndTag();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
