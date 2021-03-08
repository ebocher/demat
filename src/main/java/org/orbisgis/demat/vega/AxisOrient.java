package org.orbisgis.demat.vega;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * The orientation of a non-stacked bar, tick, area, and line charts. The value is either
 * horizontal (default) or vertical. - For bar, rule and tick, this determines whether the
 * size of the bar and tick should be applied to x or y dimension. - For area, this property
 * determines the orient property of the Vega output. - For line and trail marks, this
 * property determines the sort order of the points in the line if `config.sortLineBy` is
 * not specified. For stacked charts, this is always determined by the orientation of the
 * stack; therefore explicitly specified value will be ignored.
 *
 * The direction of the legend, one of `"vertical"` or `"horizontal"`.
 *
 * __Default value:__ - For top-/bottom-`orient`ed legends, `"horizontal"` - For
 * left-/right-`orient`ed legends, `"vertical"` - For top/bottom-left/right-`orient`ed
 * legends, `"horizontal"` for gradient legends and `"vertical"` for symbol legends.
 *
 * The default direction (`"horizontal"` or `"vertical"`) for gradient legends.
 *
 * __Default value:__ `"vertical"`.
 *
 * The default direction (`"horizontal"` or `"vertical"`) for symbol legends.
 *
 * __Default value:__ `"vertical"`.
 *
 * Orientation of the box plot. This is normally automatically determined based on types of
 * fields on x and y channels. However, an explicit `orient` be specified when the
 * orientation is ambiguous.
 *
 * __Default value:__ `"vertical"`.
 *
 * Orientation of the error bar. This is normally automatically determined, but can be
 * specified when the orientation is ambiguous and cannot be automatically determined.
 *
 * Orientation of the error band. This is normally automatically determined, but can be
 * specified when the orientation is ambiguous and cannot be automatically determined.
 */
public enum AxisOrient {
    BOTTOM, HORIZONTAL, LEFT, RIGHT, TOP, VERTICAL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BOTTOM: return "bottom";
            case HORIZONTAL: return "horizontal";
            case LEFT: return "left";
            case RIGHT: return "right";
            case TOP: return "top";
            case VERTICAL: return "vertical";
        }
        return null;
    }

    @JsonCreator
    public static AxisOrient forValue(String value) throws IOException {
        if (value.equals("bottom")) return BOTTOM;
        if (value.equals("horizontal")) return HORIZONTAL;
        if (value.equals("left")) return LEFT;
        if (value.equals("right")) return RIGHT;
        if (value.equals("top")) return TOP;
        if (value.equals("vertical")) return VERTICAL;
        throw new IOException("Cannot deserialize AxisOrient");
    }
}