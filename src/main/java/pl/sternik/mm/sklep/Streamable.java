package pl.sternik.mm.sklep;

public interface Streamable extends Downloadable {
    public byte[] nextPacket();
}
