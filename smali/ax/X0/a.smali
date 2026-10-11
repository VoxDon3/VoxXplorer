.class public final synthetic Lax/X0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/decoder/a$a;


# instance fields
.field public final synthetic a:Lax/X0/b;


# direct methods
.method public synthetic constructor <init>(Lax/X0/b;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/X0/a;->a:Lax/X0/b;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/media3/decoder/a;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/X0/a;->a:Lax/X0/b;

    check-cast p1, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    invoke-static {v0, p1}, Lax/X0/b;->y(Lax/X0/b;Landroidx/media3/decoder/a;)V

    return-void
.end method
