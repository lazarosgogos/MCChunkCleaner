import java.util.Objects;

public class Chunk {

    private int x, z, regionX, regionZ;

    public Chunk(int x, int z, int regionX, int regionZ) {
        this.x = x;
        this.z = z;
        this.regionX = regionX;
        this.regionZ = regionZ;
    }

    public int getExactX() {
        return x + regionX * 32;
    }

    public int getExactY() {
        return z + regionZ * 32;
    }

    public int getRelativeX() {
        return x;
    }

    public int getRelativeZ() {
        return z;
    }

    public int getRegionX() {
        return regionX;
    }

    public int getRegionZ() {
        return regionZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chunk chunk = (Chunk) o;
        return x == chunk.x && z == chunk.z && regionX == chunk.regionX && regionZ == chunk.regionZ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, z, regionX, regionZ);
    }
}
