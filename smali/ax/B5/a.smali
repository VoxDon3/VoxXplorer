.class public final synthetic Lax/B5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/decoder/a$a;


# instance fields
.field public final synthetic a:Lcom/google/android/exoplayer2/ext/ffmpeg/a;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/exoplayer2/ext/ffmpeg/a;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/B5/a;->a:Lcom/google/android/exoplayer2/ext/ffmpeg/a;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/media3/decoder/a;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/B5/a;->a:Lcom/google/android/exoplayer2/ext/ffmpeg/a;

    check-cast p1, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    invoke-static {v0, p1}, Lcom/google/android/exoplayer2/ext/ffmpeg/a;->B(Lcom/google/android/exoplayer2/ext/ffmpeg/a;Landroidx/media3/decoder/a;)V

    return-void
.end method
