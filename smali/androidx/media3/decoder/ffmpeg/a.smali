.class public final synthetic Landroidx/media3/decoder/ffmpeg/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/decoder/a$a;


# instance fields
.field public final synthetic a:Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/decoder/ffmpeg/a;->a:Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/media3/decoder/a;)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/a;->a:Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;

    check-cast p1, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    invoke-static {v0, p1}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->B(Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;Landroidx/media3/decoder/a;)V

    return-void
.end method
