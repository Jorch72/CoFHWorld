package cofh.cofhworld.util.numbers.world;

import cofh.cofhworld.util.numbers.INumberProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Locale;
import java.util.Random;

public class WorldValueProvider implements INumberProvider {

	protected final WorldValueEnum data;
	protected final long min, max;

	public WorldValueProvider(String type, long min, long max) {

		this.data = WorldValueEnum.valueOf(type.toUpperCase(Locale.US));
		this.min = min;
		this.max = max;
	}

	protected long getValue(World world, Random rand, BlockPos pos) {

		return data.getValue(world, rand, pos);
	}

	public int intValue(World world, Random rand, BlockPos pos) {

		return (int) longValue(world, rand, pos);
	}

	public long longValue(World world, Random rand, BlockPos pos) {

		return Math.min(Math.max(getValue(world, rand, pos), min), max);
	}

	public float floatValue(World world, Random rand, BlockPos pos) {

		return (float) doubleValue(world, rand, pos);
	}

	public double doubleValue(World world, Random rand, BlockPos pos) {

		return Math.min(Math.max(getValue(world, rand, pos), min), max);
	}

}
