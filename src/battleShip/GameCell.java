package battleShip;

public enum GameCell {
    FREE_CELL("□"),
    SHIP_CELL("■"),
    SHIP_HALO("▤"),
    PADDED_CELL("⛝"),
    MISS_CELL("▩"); //Ячейка промаха используемая в дополнительной матрице

    private String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    GameCell(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return img;
    }
}

