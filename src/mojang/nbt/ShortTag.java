package mojang.nbt;

/**
 * Copyright Mojang AB.
 * 
 * Don't do evil.
 */

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ShortTag extends Tag {
    public short data;

    public ShortTag(String name) {
        super(name);
    }

    public ShortTag(String name, short data) {
        super(name);
        this.data = data;
    }

    @Override
	void write(DataOutput dos) throws IOException {
        dos.writeShort(data);
    }

    @Override
	void load(DataInput dis) throws IOException {
        data = dis.readShort();
    }

    @Override
	public byte getId() {
        return TAG_Short;
    }

    @Override
	public String toString() {
        return "" + data;
    }

    @Override
    public Tag copy() {
        return new ShortTag(getName(), data);
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            ShortTag o = (ShortTag) obj;
            return data == o.data;
        }
        return false;
    }

}
